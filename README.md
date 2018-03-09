# springboot_crud_operation
start application as spring boot 
open browser localhost:7777/product/all    TO SEE ALL PRODUCT LIST
use postman app
#######TO ADD NOTE(Method type should be PUT)
localhost:7777/product/add
send Product object in json format to add into database using postman body
######TO DELETE NOTE(Method type should be DELETE)
localhost:7777/product/id/{id}
pass an id of product 
######TO  UPDATE  NOTE(Method type should be UPDATE)
localhost:7777/product/update/{id}
send Product updated  object in json format to add into database using postman body
 NOTE ::don't pass incomplete Product object 
 DO PASS ALL MEMBER var of Product else it will throw an error as @JsonProperty has not been added
 
 PLZ NOTE HERE EVERY WHERE Product.class from entity package has been Use NO WHERE **** Product.class from model package Used
