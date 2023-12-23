package flower.store;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 1000;
    private static final int MAX_QUANTITY = 200;
    private FlowerPack flowerPack;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        FlowerType flowerType = FlowerType.CHAMOMILE;
        flower.setFlowerType(flowerType);
        flower.setPrice(RANDOM_GENERATOR.nextInt(MAX_PRICE));
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        flowerPack = new FlowerPack(flower, quantity);
    }

    @Test
    public void testQuantity() {
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        flowerPack.setQuantity(quantity);
        Assertions.assertEquals(quantity, flowerPack.getQuantity());
    }

    @Test
    public void testPrice() {
        double price = flower.getPrice() * flowerPack.getQuantity();
        Assertions.assertEquals(price, flowerPack.getPrice());
    }
}