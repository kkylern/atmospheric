package com.teamabnormals.atmospheric.core.data.server.tags;

import com.teamabnormals.atmospheric.core.Atmospheric;
import com.teamabnormals.atmospheric.core.other.tags.AtmosphericBiomeTags;
import com.teamabnormals.blueprint.core.other.tags.BlueprintBiomeTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.teamabnormals.atmospheric.core.registry.AtmosphericBiomes.*;

public class AtmosphericBiomeTagsProvider extends BiomeTagsProvider {

	public AtmosphericBiomeTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Atmospheric.MOD_ID, existingFileHelper);
	}

	@Override
	public void addTags() {
		this.tag(BiomeTags.HAS_MINESHAFT).addTag(AtmosphericBiomeTags.IS_DUNES).add(ASPEN_PARKLAND.get(), KOUSA_JUNGLE.get(), SCRUBLAND.get(), SNOWY_SCRUBLAND.get(), SPINY_THICKET.get(), GRIMWOODS.get());
		this.tag(BiomeTags.IS_OVERWORLD).addTag(AtmosphericBiomeTags.IS_RAINFOREST).addTag(AtmosphericBiomeTags.IS_DUNES).add(ASPEN_PARKLAND.get(), KOUSA_JUNGLE.get(), SCRUBLAND.get(), SNOWY_SCRUBLAND.get(), SPINY_THICKET.get(), GRIMWOODS.get());
		this.tag(BiomeTags.STRONGHOLD_BIASED_TO).addTag(AtmosphericBiomeTags.IS_RAINFOREST).addTag(AtmosphericBiomeTags.IS_DUNES).add(ASPEN_PARKLAND.get(), KOUSA_JUNGLE.get(), SCRUBLAND.get(), SNOWY_SCRUBLAND.get(), SPINY_THICKET.get(), GRIMWOODS.get());

		this.tag(BiomeTags.IS_FOREST).addTag(AtmosphericBiomeTags.IS_RAINFOREST).add(LAUREL_FOREST.get(), GRIMWOODS.get());
		this.tag(BlueprintBiomeTags.IS_DESERT).addTag(AtmosphericBiomeTags.IS_DUNES).add(SCRUBLAND.get(), SNOWY_SCRUBLAND.get(), SPINY_THICKET.get());
		this.tag(BiomeTags.HAS_RUINED_PORTAL_STANDARD).add(ASPEN_PARKLAND.get(), KOUSA_JUNGLE.get(), GRIMWOODS.get());
		this.tag(BiomeTags.HAS_RUINED_PORTAL_DESERT).addTag(AtmosphericBiomeTags.IS_DUNES).add(SCRUBLAND.get(), SNOWY_SCRUBLAND.get(), SPINY_THICKET.get());
		this.tag(BiomeTags.HAS_PILLAGER_OUTPOST).add(SCRUBLAND.get());
		this.tag(BiomeTags.SPAWNS_COLD_VARIANT_FROGS).add(KOUSA_JUNGLE.get()).add(SNOWY_SCRUBLAND.get());
		this.tag(BiomeTags.SPAWNS_WARM_VARIANT_FROGS).addTag(AtmosphericBiomeTags.IS_RAINFOREST).addTag(AtmosphericBiomeTags.IS_DUNES).add(SCRUBLAND.get(), SPINY_THICKET.get());
		this.tag(BiomeTags.WATER_ON_MAP_OUTLINES).add(RAINFOREST_BASIN.get(), SPARSE_RAINFOREST_BASIN.get());
		this.tag(BiomeTags.ONLY_ALLOWS_SNOW_AND_GOLD_RABBITS).addTag(AtmosphericBiomeTags.IS_DUNES).add(SPINY_THICKET.get(), SCRUBLAND.get(), SNOWY_SCRUBLAND.get());

		this.tag(AtmosphericBiomeTags.IS_RAINFOREST).add(RAINFOREST.get(), SPARSE_RAINFOREST.get(), RAINFOREST_BASIN.get(), SPARSE_RAINFOREST_BASIN.get());
		this.tag(AtmosphericBiomeTags.IS_DUNES).add(DUNES.get(), FLOURISHING_DUNES.get(), ROCKY_DUNES.get(), PETRIFIED_DUNES.get());
		this.tag(AtmosphericBiomeTags.HAS_ARID_GARDEN).addTag(AtmosphericBiomeTags.IS_DUNES);
		this.tag(AtmosphericBiomeTags.HAS_VILLAGE_SCRUBLAND).add(SCRUBLAND.get());
		this.tag(AtmosphericBiomeTags.HAS_KOUSA_SANCTUM).add(KOUSA_JUNGLE.get());
		this.tag(AtmosphericBiomeTags.ONLY_ALLOWS_YELLOW_RABBITS).add(ASPEN_PARKLAND.get());
	}

	@SafeVarargs
	private void tag(Biome biome, TagKey<Biome>... tags) {
		for (TagKey<Biome> key : tags) {
			tag(key).add(biome);
		}
	}
}