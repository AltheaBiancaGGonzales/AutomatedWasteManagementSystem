class RecyclableWasteCollector extends WasteCollector {
    public RecyclableWasteCollector(WasteCollector successor) {
        super(successor);
    }
    
    @Override
    public void handleRequest(WasteContainer container) {
        if (container.getWasteType().equals("recyclable") && container.isFull()) {
            System.out.println("Collecting and processing recyclable waste...");
        } else if (successor != null) {
            successor.handleRequest(container);
        }
    }
}
