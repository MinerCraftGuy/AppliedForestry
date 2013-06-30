package appfor.block.apiculture;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import forestry.api.apiculture.IBee;
import forestry.api.apiculture.IBeeGenome;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;
import forestry.api.genetics.IIndividual;

public class BlockMEApiary extends Block implements IBeeHousing {

    public BlockMEApiary(int par1, Material par2Material) {
        super(par1, par2Material);
    }

    @Override
    public float getTerritoryModifier(IBeeGenome genome, float currentModifier) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getMutationModifier(IBeeGenome genome, IBeeGenome mate,
            float currentModifier) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getLifespanModifier(IBeeGenome genome, IBeeGenome mate,
            float currentModifier) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getProductionModifier(IBeeGenome genome, float currentModifier) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getFloweringModifier(IBeeGenome genome, float currentModifier) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isSealed() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isSelfLighted() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isSunlightSimulated() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isHellish() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void onQueenChange(ItemStack queen) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void wearOutEquipment(int amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onQueenDeath(IBee queen) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onPostQueenDeath(IBee queen) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean onPollenRetrieved(IBee queen, IIndividual pollen,
            boolean isHandled) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean onEggLaid(IBee queen) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getOwnerName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public World getWorld() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getXCoord() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getYCoord() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getZCoord() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getBiomeId() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public EnumTemperature getTemperature() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EnumHumidity getHumidity() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setErrorState(int state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getErrorOrdinal() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean addProduct(ItemStack product, boolean all) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ItemStack getQueen() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ItemStack getDrone() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setQueen(ItemStack itemstack) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setDrone(ItemStack itemstack) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean canBreed() {
        // TODO Auto-generated method stub
        return false;
    }

}
