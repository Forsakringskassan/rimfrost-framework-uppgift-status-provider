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
      assertEquals("1", defaultUppgiftstatusProvider.getPlaneradId());
   }

   @Test
   public void testGetTilldeladId()
   {
      assertEquals("2", defaultUppgiftstatusProvider.getTilldeladId());
   }

   @Test
   public void testGetAvslutadId()
   {
      assertEquals("3", defaultUppgiftstatusProvider.getAvslutadId());
   }
}
