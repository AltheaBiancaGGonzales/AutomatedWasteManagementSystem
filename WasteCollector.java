abstract class WasteCollector {
    protected WasteCollector successor;
    
    public WasteCollector(WasteCollector successor) {
        this.successor = successor;
    }
    
    public abstract void handleRequest(WasteContainer container);
}
