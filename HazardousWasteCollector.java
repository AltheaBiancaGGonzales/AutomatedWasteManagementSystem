class HazardousWasteCollector extends WasteCollector {
    public HazardousWasteCollector(WasteCollector successor) {
        super(successor);
    }
    
    @Override
    public void handleRequest(WasteContainer container) {
        if (container.getWasteType().equals("hazardous") && container.isFull()) {
            System.out.println("Handling and disposing hazardous waste carefully...");
        } else if (successor != null) {
            successor.handleRequest(container);
        }
    }
}
