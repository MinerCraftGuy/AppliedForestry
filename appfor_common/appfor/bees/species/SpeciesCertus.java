package appfor.bees.species;

import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.apiculture.EnumBeeType;
import forestry.api.apiculture.IAlleleBeeSpecies;
import forestry.api.apiculture.IBeeGenome;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.apiculture.IBeeRoot;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;
import forestry.api.core.IIconProvider;
import forestry.api.genetics.IClassification;
import forestry.api.genetics.IIndividual;

public class SpeciesCertus implements IAlleleBeeSpecies {

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getBinomial() {
        return "certii";
    }

    @Override
    public String getAuthority() {
        return "Myo-kun";
    }

    @Override
    public IClassification getBranch() {
        return null;
    }

    @Override
    public int getComplexity() {
        return 5;
    }

    @Override
    public float getResearchSuitability(ItemStack itemstack) {
        return 0;
    }

    @Override
    public ItemStack[] getResearchBounty(World world, String researcher,
            IIndividual individual, int bountyLevel) {
        return null;
    }

    @Override
    public EnumTemperature getTemperature() {
        return EnumTemperature.NORMAL;
    }

    @Override
    public EnumHumidity getHumidity() {
        return EnumHumidity.NORMAL;
    }

    @Override
    public boolean hasEffect() {
        return false;
    }

    @Override
    public boolean isSecret() {
        return false;
    }

    @Override
    public boolean isCounted() {
        return true;
    }

    @Override
    public int getIconColour(int renderPass) {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    IIconProvider getIconProvider() {
        return null;
    }

    @Override
    public String getUID() {
        return "speciesCertus";
    }

    @Override
    public boolean isDominant() {
        return false;
    }

    @Override
    public String getName() {
        return "Certus";
    }

    @Override
    public IBeeRoot getRoot() {
        return null;
    }

    @Override
    public boolean isNocturnal() {
        return false;
    }

    @Override
    public Map<ItemStack, Integer> getProducts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<ItemStack, Integer> getSpecialty() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isJubilant(IBeeGenome genome, IBeeHousing housing) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    Icon getIcon(EnumBeeType type, int renderPass) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getEntityTexture() {
        // TODO Auto-generated method stub
        return null;
    }

}
