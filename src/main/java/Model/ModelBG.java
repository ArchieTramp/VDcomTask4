package Model;

public class ModelBG {
    private Integer id;
    private String name;
    private Integer price;
    private String creator;

    private static ModelBG outInstance = new ModelBG();
    public static ModelBG getInstance()
    {return  outInstance;}

    private ModelBG() {
    }

    public ModelBG(Integer id, String name, Integer price, String creator) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.creator = creator;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ModelBG{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", creator='" + creator + '\'' +
                '}';
    }
}

