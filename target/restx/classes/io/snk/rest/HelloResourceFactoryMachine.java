package io.snk.rest;

import com.google.common.collect.ImmutableSet;
import restx.factory.*;
import io.snk.rest.HelloResource;

@Machine
public class HelloResourceFactoryMachine extends SingleNameFactoryMachine<io.snk.rest.HelloResource> {
    public static final Name<io.snk.rest.HelloResource> NAME = Name.of(io.snk.rest.HelloResource.class, "HelloResource");

    public HelloResourceFactoryMachine() {
        super(0, new StdMachineEngine<io.snk.rest.HelloResource>(NAME, 0, BoundlessComponentBox.FACTORY) {


            @Override
            public BillOfMaterials getBillOfMaterial() {
                return new BillOfMaterials(ImmutableSet.<Factory.Query<?>>of(

                ));
            }

            @Override
            protected io.snk.rest.HelloResource doNewComponent(SatisfiedBOM satisfiedBOM) {
                return new HelloResource(

                );
            }
        });
    }

}
