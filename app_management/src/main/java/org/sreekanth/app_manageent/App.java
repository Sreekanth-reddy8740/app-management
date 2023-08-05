package org.sreekanth.app_manageent;

import org.sreekanth.app_management.dto.AppDto;
import org.sreekanth.app_management.entity.AppEntity;
import org.sreekanth.app_management.repository.AppRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AppEntity appEntity = new AppEntity();
        appEntity.setCreatedBy("Siva1234");
        appEntity.setCreatedDate("199-10-2");
        appEntity.setModifieBy("Akki");
        appEntity.setModifiedDate("2001-12-1");
        appEntity.setStatus("UP");
        appEntity.setUrl("https://www.Siv.com");
        appEntity.setServiceName("facebook");
        AppRepository repository = new AppRepository();
        repository.saveOrUpdate(appEntity);
       // AppEntity entity = repository.findById(1);
        //System.out.println(entity);
        
        AppDto appDto = new AppDto();
        appDto.setAltkey(4);
        appDto.setCreatedBy("abc");
        appDto.setModifieBy("xyz");
        appDto.setStatus("Process");
        appDto.setServiceName("whatsapp");
        //repository.update(appDto);
        
        
    }
}
