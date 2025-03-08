class WasteContainer {
    private String wasteType;
    private int capacity;
    private int currentLevel;
    
    public WasteContainer(String wasteType, int capacity, int currentLevel) {
        this.wasteType = wasteType;
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }
    
    public String getWasteType() {
        return wasteType;
    }
    
    public boolean isFull() {
        return currentLevel >= capacity;
    }
}
