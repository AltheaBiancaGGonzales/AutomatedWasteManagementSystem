class OrganicWasteCollector extends WasteCollector {
    public OrganicWasteCollector(WasteCollector successor) {
        super(successor);
    }
    
    @Override
    public void handleRequest(WasteContainer container) {
        if (container.getWasteType().equals("organic") && container.isFull()) {
            System.out.println("Collecting and disposing organic waste...");
        } else if (successor != null) {
            successor.handleRequest(container);
        }
    }
}
