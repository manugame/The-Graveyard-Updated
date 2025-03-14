package com.lion.graveyard.entities.models;

import com.lion.graveyard.Graveyard;
import com.lion.graveyard.entities.NightmareEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;


public class NightmareModel extends GeoModel<NightmareEntity> {

    @Override
    public ResourceLocation getModelResource(NightmareEntity object) {
        return ResourceLocation.fromNamespaceAndPath(Graveyard.MOD_ID, "geo/nightmare.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NightmareEntity object) {
        return ResourceLocation.fromNamespaceAndPath(Graveyard.MOD_ID, "textures/entity/nightmare.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NightmareEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Graveyard.MOD_ID, "animations/nightmare/nightmare.animation.json");
    }
}
