/*
 * Swagger BookUnity
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Condition;
import io.swagger.model.Genre;
import io.swagger.model.Photo;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Book
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-24T18:42:49.417Z")
public class Book   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("yearOfIssue")
  private Integer yearOfIssue = null;

  @JsonProperty("publishingHouse")
  private String publishingHouse = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("numberOfPages")
  private Integer numberOfPages = null;

  @JsonProperty("price")
  private String price = null;

  @JsonProperty("ownImpression")
  private String ownImpression = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("genre")
  private List<Genre> genre = null;

  @JsonProperty("photos")
  private List<Photo> photos = null;
  
  @JsonProperty("login")
  private String login = null;

  /**
   * book for sale of exchange
   */
  public enum CategoryEnum {
    SALE("sale"),
    
    EXCHANGE("exchange");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("category")
  private String category = null;

  public Book id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Book name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(example = "The Last Leaf", required = true, value = "")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   **/
  @JsonProperty("author")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  
  public Book login(String login) {
	    this.login = login;
	    return this;
	  }

	  /**
	   * Get author
	   * @return author
	   **/
	  @JsonProperty("login")
	  @ApiModelProperty(required = true, value = "")
	  @NotNull
	  public String getLogin() {
	    return login;
	  }

	  public void setLogin(String login) {
		  this.login = login;
	  }
  
  
  public Book language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   **/
  @JsonProperty("language")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Book yearOfIssue(Integer yearOfIssue) {
    this.yearOfIssue = yearOfIssue;
    return this;
  }

  /**
   * Get yearOfIssue
   * @return yearOfIssue
   **/
  @JsonProperty("yearOfIssue")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Integer getYearOfIssue() {
    return yearOfIssue;
  }

  public void setYearOfIssue(Integer yearOfIssue) {
    this.yearOfIssue = yearOfIssue;
  }

  public Book publishingHouse(String publishingHouse) {
    this.publishingHouse = publishingHouse;
    return this;
  }

  /**
   * Get publishingHouse
   * @return publishingHouse
   **/
  @JsonProperty("publishingHouse")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getPublishingHouse() {
    return publishingHouse;
  }

  public void setPublishingHouse(String publishingHouse) {
    this.publishingHouse = publishingHouse;
  }

  public Book description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @JsonProperty("description")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Book numberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
    return this;
  }

  /**
   * Get numberOfPages
   * @return numberOfPages
   **/
  @JsonProperty("numberOfPages")
  @ApiModelProperty(value = "")
  public Integer getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public Book price(String price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @JsonProperty("price")
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Book ownImpression(String ownImpression) {
    this.ownImpression = ownImpression;
    return this;
  }

  /**
   * Get ownImpression
   * @return ownImpression
   **/
  @JsonProperty("ownImpression")
  @ApiModelProperty(value = "")
  public String getOwnImpression() {
    return ownImpression;
  }

  public void setOwnImpression(String ownImpression) {
    this.ownImpression = ownImpression;
  }

  public Book condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   **/
  @JsonProperty("condition")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public Book genre(List<Genre> genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Get genre
   * @return genre
   **/
  @JsonProperty("genre")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<Genre> getGenre() {
    return genre;
  }

  public void setGenre(List<Genre> genre) {
    this.genre = genre;
  }

  public Book photos(List<Photo> photos) {
    this.photos = photos;
    return this;
  }

  public Book addPhotosItem(Photo photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<Photo>();
    }
    this.photos.add(photosItem);
    return this;
  }

  /**
   * Get photos
   * @return photos
   **/
  @JsonProperty("photos")
  @ApiModelProperty(value = "")
  public List<Photo> getPhotos() {
    return photos;
  }

  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  public Book category(String category) {
    this.category = category;
    return this;
  }

  /**
   * book for sale of exchange
   * @return category
   **/
  @JsonProperty("category")
  @ApiModelProperty(required = true, value = "book for sale of exchange")
  @NotNull
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.name, book.name) &&
        Objects.equals(this.author, book.author) &&
        Objects.equals(this.language, book.language) &&
        Objects.equals(this.yearOfIssue, book.yearOfIssue) &&
        Objects.equals(this.publishingHouse, book.publishingHouse) &&
        Objects.equals(this.description, book.description) &&
        Objects.equals(this.numberOfPages, book.numberOfPages) &&
        Objects.equals(this.price, book.price) &&
        Objects.equals(this.ownImpression, book.ownImpression) &&
        Objects.equals(this.login, book.login) &&
        Objects.equals(this.condition, book.condition) &&
        Objects.equals(this.genre, book.genre) &&
        Objects.equals(this.photos, book.photos) &&
        Objects.equals(this.category, book.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, author, language, yearOfIssue, publishingHouse, description, numberOfPages, price, ownImpression, login, condition, genre, photos, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    yearOfIssue: ").append(toIndentedString(yearOfIssue)).append("\n");
    sb.append("    publishingHouse: ").append(toIndentedString(publishingHouse)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    ownImpression: ").append(toIndentedString(ownImpression)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

