package com.telerik.best_style_ltd.entities;


import javax.persistence.*;

@Entity
@Table(name = "patterns")
public class Pattern {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "sizes", nullable = false)
    private String sizes;

    @Column(name = "material", nullable = false)
    private String material;

    @Column(name = "designer", nullable = false)
    private String designer;

    @Column(name = "priceForOnePiece", nullable = false)
    private double priceForOnePiece;

    @Column(name = "priceForBulkPieces", nullable = false)
    private double priceForBulkPieces;

    public Pattern() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public double getPriceForOnePiece() {
        return priceForOnePiece;
    }

    public void setPriceForOnePiece(double priceForOnePiece) {
        this.priceForOnePiece = priceForOnePiece;
    }

    public double getPriceForBulkPieces() {
        return priceForBulkPieces;
    }

    public void setPriceForBulkPieces(double priceForBulkPieces) {
        this.priceForBulkPieces = priceForBulkPieces;
    }
}
