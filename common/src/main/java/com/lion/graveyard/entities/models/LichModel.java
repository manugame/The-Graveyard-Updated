package com.lion.graveyard.entities.models;

import com.lion.graveyard.Graveyard;
import com.lion.graveyard.entities.LichEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;


public class LichModel extends GeoModel<LichEntity> {
    private ResourceLocation texture =ResourceLocation.fromNamespaceAndPath(Graveyard.MOD_ID, "textures/entity/lich_texture.png");

    @Override
    public ResourceLocation getModelResource(LichEntity object) {
        return ResourceLocation.fromNamespaceAndPath(Graveyard.MOD_ID, "geo/lich.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LichEntity object) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(LichEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(Graveyard.MOD_ID, "animations/lich/lich.animation.json");
    }

}
