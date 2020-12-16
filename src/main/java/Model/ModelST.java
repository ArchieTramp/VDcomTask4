package Model;

public class ModelST {
    private Integer id;
    private String name;
    private Integer price;
    private String forAge;

    private static ModelST outInstance = new ModelST();
    public static ModelST getInstance()
    {return  outInstance;}

    private ModelST() {
    }



    public ModelST(Integer id, String name, Integer price, String forAge) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.forAge = forAge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getForAge() {
        return forAge;
    }

    public void setForAge(String forAge) {
        this.forAge = forAge;
    }

    @Override
    public String toString() {
        return "ModelST{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", forAge='" + forAge + '\'' +
                '}';
    }
}
