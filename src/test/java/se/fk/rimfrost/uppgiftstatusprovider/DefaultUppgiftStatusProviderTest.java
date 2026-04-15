package se.fk.rimfrost.uppgiftstatusprovider;

import io.quarkus.test.component.QuarkusComponentTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusComponentTest
public class DefaultUppgiftStatusProviderTest
{
   @Inject
   DefaultUppgiftStatusProvider defaultUppgiftstatusProvider;

   @Test
   public void testGetPlaneradId()
   {
      assertEquals("c7477256-eabd-4ff2-833a-2db9051caf86", defaultUppgiftstatusProvider.getPlaneradId());
   }

   @Test
   public void testGetTilldeladId()
   {
      assertEquals("0b202a3f-052d-450a-8866-ae141a80d289", defaultUppgiftstatusProvider.getTilldeladId());
   }

   @Test
   public void testGetAvslutadId()
   {
      assertEquals("5161d678-3835-454c-979b-dc1c9e06beac", defaultUppgiftstatusProvider.getAvslutadId());
   }
}
