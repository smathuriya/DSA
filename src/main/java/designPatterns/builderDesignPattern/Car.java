package designPatterns.builderDesignPattern;

public class Car {
    private final String engine;
    private final String color;
    private final int seats;
    private final boolean airbags;
    
    private Car(String engine, String color, int seats, boolean airbags) {
        this.engine = engine;
        this.color = color;
        this.seats = seats;
        this.airbags = airbags;
    }
    
    public String getEngine() {
        return engine;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getSeats() {
        return seats;
    }
    
    public boolean hasAirbags() {
        return airbags;
    }
    
    public static class SportsCarBuilder implements CarBuilder {
        private String engine;
        private String color;
        private int seats;
        private boolean airbags;
        
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        
        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }
        
        public CarBuilder setAirbags(boolean airbags) {
            this.airbags = airbags;
            return this;
        }
        
        public Car build() {
            if (engine == null) {
                throw new IllegalStateException("Engine is a compulsory field and must be set.");
            }
            return new Car(engine, color, seats, airbags);
        }
    }
    
    public interface CarBuilder {
        CarBuilder setEngine(String engine);
        CarBuilder setColor(String color);
        CarBuilder setSeats(int seats);
        CarBuilder setAirbags(boolean airbags);
        Car build();
    }
}
