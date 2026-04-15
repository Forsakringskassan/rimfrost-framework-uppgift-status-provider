package se.fk.rimfrost.uppgiftstatusprovider;

import jakarta.enterprise.context.ApplicationScoped;
import se.fk.rimfrost.framework.uppgiftstatusprovider.UppgiftStatusProvider;

@ApplicationScoped
public class DefaultUppgiftStatusProvider implements UppgiftStatusProvider
{

   @Override
   public String getPlaneradId()
   {
      return "1";
   }

   @Override
   public String getTilldeladId()
   {
      return "2";
   }

   @Override
   public String getAvslutadId()
   {
      return "3";
   }
}
