package appfor.block.apiculture;

import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import forestry.api.apiculture.IAlvearyComponent;
import forestry.api.apiculture.IBeeListener;
import forestry.api.apiculture.IBeeModifier;
import forestry.api.core.ITileStructure;

public class BlockMEAlvearyComponent implements IAlvearyComponent {

    @Override
    public String getTypeUID() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void validateStructure() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onStructureReset() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ITileStructure getCentralTE() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setCentralTE(TileEntity tile) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public IInventory getInventory() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void makeMaster() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isMaster() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isIntegratedIntoStructure() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void registerBeeModifier(IBeeModifier modifier) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeBeeModifier(IBeeModifier modifier) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void registerBeeListener(IBeeListener event) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeBeeListener(IBeeListener event) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addTemperatureChange(float change, float boundaryDown,
            float boundaryUp) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addHumidityChange(float change, float boundaryDown,
            float boundaryUp) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean hasFunction() {
        // TODO Auto-generated method stub
        return false;
    }

}
