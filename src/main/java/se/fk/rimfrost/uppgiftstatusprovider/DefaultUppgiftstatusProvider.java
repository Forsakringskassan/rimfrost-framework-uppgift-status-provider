package se.fk.rimfrost.uppgiftstatusprovider;

import jakarta.enterprise.context.ApplicationScoped;
import se.fk.rimfrost.framework.uppgiftstatusprovider.UppgiftstatusProvider;

@ApplicationScoped
public class DefaultUppgiftstatusProvider implements UppgiftstatusProvider
{

   @Override
   public String getPlaneradId()
   {
      return "c7477256-eabd-4ff2-833a-2db9051caf86";
   }

   @Override
   public String getTilldeladId()
   {
      return "0b202a3f-052d-450a-8866-ae141a80d289";
   }

   @Override
   public String getAvslutadId()
   {
      return "5161d678-3835-454c-979b-dc1c9e06beac";
   }
}
