package io.yoshizaki4439.petshop;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;

import org.jboss.weld.bootstrap.spi.BeanDiscoveryMode;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldJunit5Extension;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import io.yoshizaki4439.kennel.CatHouse;


@ExtendWith(WeldJunit5Extension.class)
public class SamplePetShopTest {

    @WeldSetup
    public WeldInitiator weld = WeldInitiator
            .from(new Weld())
            .build();

    @Test
    void testMakeSound() {

    	System.out.println("aaaa");
    	weld.select(CatHouse.class).get().makeSounds();
    }
}