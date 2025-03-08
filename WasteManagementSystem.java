public class WasteManagementSystem {
    public static WasteCollector setupWasteCollectionChain() {
        WasteCollector hazardousCollector = new HazardousWasteCollector(null);
        WasteCollector recyclableCollector = new RecyclableWasteCollector(hazardousCollector);
        return new OrganicWasteCollector(recyclableCollector);
    }
    
    public static void main(String[] args) {
        WasteCollector wasteChain = setupWasteCollectionChain();
        
        WasteContainer[] containers = {
            new WasteContainer("organic", 50, 50),
            new WasteContainer("recyclable", 30, 30),
            new WasteContainer("hazardous", 20, 20),
            new WasteContainer("organic", 40, 10) // Not full, should not trigger collection
        };
        
        for (WasteContainer container : containers) {
            wasteChain.handleRequest(container);
        }
    }
}
