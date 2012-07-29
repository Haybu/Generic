package com.bac.bacrow.system;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.orm.jpa.persistenceunit.MutablePersistenceUnitInfo;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitPostProcessor;

public class BacPersistenceUnitPostProcessor implements PersistenceUnitPostProcessor
{
	
	String path;

   @Autowired
   private ResourcePatternResolver resourceLoader;
   
   public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

   public void postProcessPersistenceUnitInfo(MutablePersistenceUnitInfo mutablePersistenceUnitInfo)
   {
      try
      {
         Resource[] resources = resourceLoader.getResources("classpath:"+getPath()); //resourceLoader.getResources("classpath:org/myexample/*.class");
         for (Resource resource : resources)
         {
            CachingMetadataReaderFactory cachingMetadataReaderFactory = new CachingMetadataReaderFactory();
            MetadataReader metadataReader = cachingMetadataReaderFactory.getMetadataReader(resource);
            if (metadataReader.getAnnotationMetadata().isAnnotated(javax.persistence.Entity.class.getName()))
            {
               mutablePersistenceUnitInfo.addManagedClassName(metadataReader.getClassMetadata().getClassName());
            }
         }
         mutablePersistenceUnitInfo.setExcludeUnlistedClasses(true);
      }
      catch (IOException e)
      {
         throw new RuntimeException(e);
      }
   }
}
