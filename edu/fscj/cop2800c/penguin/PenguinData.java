// PenguinData.java
// Brian Sosa
// 11/01/26
// Encapsulates a single penguin's data

package edu.fscj.cop2800c.penguin;

public class PenguinData {
    // Private fields for encapsulation
    private int sampleNumber;
    private String species;
    private double billLength;
    private double billDepth;
    private double flipperLength;
    private double bodyMass;
    private String sex;

    // Constructor to initialize fields
    public PenguinData(int sampleNumber, String species, double billLength,
            double billDepth, double flipperLength, double bodyMass,
            String sex) {
        this.sampleNumber = sampleNumber;
        this.species = species;
        this.billLength = billLength;
        this.billDepth = billDepth;
        this.flipperLength = flipperLength;
        this.bodyMass = bodyMass;
        this.sex = sex;
    }

    // Getter methods for encapsulation

    // Returns the sample number.
    public int getSampleNumber() {
        return sampleNumber;
    }

    // Returns the penguin species.
    public String getSpecies() {
        return species;
    }

    // Returns the bill length.
    public double getBillLength() {
        return billLength;
    }

    // Returns the bill depth.
    public double getBillDepth() {
        return billDepth;
    }

    // Returns the flipper length.
    public double getFlipperLength() {
        return flipperLength;
    }

    // Returns the body mass.
    public double getBodyMass() {
        return bodyMass;
    }

    // Returns the penguin's sex.
    public String getSex() {
        return sex;
    }
}