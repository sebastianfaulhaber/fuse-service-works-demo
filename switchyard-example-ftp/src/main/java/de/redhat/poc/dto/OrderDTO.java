package de.redhat.poc.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\|")
@XmlRootElement(name = "Order")
public class OrderDTO implements Serializable {

	private static final long serialVersionUID = -5727279669674020847L;

	@DataField(pos = 1)
	@XmlElement
    private String Id;

    @DataField(pos = 2)
    @XmlElement
    private String product;

    @DataField(pos = 3)
    @XmlElement
    private String price;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order [Id=" + Id + ", product=" + product + ", price=" + price
                + "]";
    }
	
}
