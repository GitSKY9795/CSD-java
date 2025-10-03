public class product {
    private double price; // Assuming mutable price
    private double discountPercentage;

    // Constructor
    public product(double price, double discountPercentage) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        if(discountPercentage<0||discountPercentage>100)
        throw new IllegalArgumentException("Enter a valid discount.");
        this.price = price;
        this.discountPercentage = discountPercentage; // Direct assignment
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    // Getter for discountPercentage
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    // Setter for discountPercentage
    public void setDiscountPercentage(double discountPercentage) {
      // Use helper method
        this.discountPercentage = discountPercentage;
    }

    // Private helper method for discount validation
 

    // Calculate final price
    public double getFinalPrice() {
        return price * (1 - discountPercentage / 100);
    }

    // Main method for testing
    public static void main(String[] args) {
        try {
            product product = new product(100.0, 20.0);
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount: " + product.getDiscountPercentage() + "%");
            System.out.println("Final Price: " + product.getFinalPrice());
            product.setDiscountPercentage(30.0);
            System.out.println("New Final Price after discount change: " + product.getFinalPrice());
            product.setPrice(150.0);
            System.out.println("New Price: " + product.getPrice());
            System.out.println("Final Price after price change: " + product.getFinalPrice());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}