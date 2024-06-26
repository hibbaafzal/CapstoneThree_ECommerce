# E-Commerce Website

The goal of this application is to provide users with a smooth and seamless experience while navigating the e-commerce website. 

Users can:
- filter through products according to the price range,
- filter by category,
- filter by color,
- add products to their cart
- edit/create a new profile

Admins can:
- add or delete products,
- add or delete categories.


## The Home Page

When the user first opens the website, they can choose a category, login, or filter products according to the price range. 

<img width="1512" alt="Screenshot 2024-06-26 at 5 51 31 PM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/e0f88d56-8aa4-4f03-9e45-381d342f5d9f">

<details> 
  
  **<summary> Categories </summary>**


  ### Testing In Postman

  <img width="799" alt="Screenshot 2024-06-26 at 11 22 32 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/bb9d04bb-85b3-4831-ba74-fa574d367882">


  ### Add/Delete a Category 

  Only admins are allowed to add categories to the website.

  <img width="822" alt="Screenshot 2024-06-26 at 11 27 04 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/ac8de1dd-8f22-458b-a58d-e525bf981810">


Once the category is added, it will show up on the website.


<img width="359" alt="Screenshot 2024-06-26 at 11 27 49 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/33d627fd-9684-4a70-a12d-2d87081263b6">


Admins can also delete categories, and it will be deleted from the website. The admin has to specify which category id they would like to remove, and it will be removed. 



<img width="816" alt="Screenshot 2024-06-26 at 11 31 42 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/c7edd5bb-dcb2-473d-9a06-220804854c76">


<img width="356" alt="Screenshot 2024-06-26 at 11 32 25 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/3b486e99-8152-4305-b21d-70f8589720ea">




If a user wants to add/delete a category, it will result in an error. 


<img width="786" alt="Screenshot 2024-06-26 at 11 28 58 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/91aa3edd-7ea7-4685-a75c-4d976c315b95">


  
### Filter by Category


Users can filter products by the category.


<img width="347" alt="Screenshot 2024-06-26 at 11 13 49 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/a7145bf8-c525-4679-a59c-321ebcdfeadf">

Once they choose a category, only products from that category will be displpayed. 

<img width="1098" alt="Screenshot 2024-06-26 at 5 52 42 PM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/353291be-5b07-43c6-afd5-3d6ad103ac4e">

  
</details>



<details> 
  
  **<summary> Price Range </summary>**


  ### Filter by Price

Users can filter by the price, using the slider, and only products within that price range will be displayed. 

  
<img width="1098" alt="Screenshot 2024-06-26 at 5 53 32 PM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/82e280ce-bd0e-4cf0-a168-49bf1310800c">

 <img width="1146" alt="Screenshot 2024-06-26 at 5 54 18 PM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/7412a6b2-300c-4035-b986-8a2b272fa254">


 

Shown below are products from the price range of 25-100 dollars. 

<img width="1135" alt="Screenshot 2024-06-26 at 1 37 15 PM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/d9cff0f8-0966-4015-9966-dba0f248c1de">




</details>



<details> 
  
  **<summary> Adding to Cart </summary>**

Users are also able to add products to their cart, view their cart, and clear their cart. When a user logs out, and logs back into their account, the cart items, are still avaliable for them to see.


A user must be logged in, in order to add products to their cart.

<img width="1512" alt="Screenshot 2024-06-26 at 6 00 12 PM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/12b3c56a-54f3-417d-a7f6-e4d98148a088">


When the user logs in, their cart is availiable for them to see. 

<img width="303" alt="Screenshot 2024-06-26 at 11 43 08 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/e8bb6b6f-382e-4829-99bb-1fa30769f42d">




View Cart:

<img width="1320" alt="Screenshot 2024-06-26 at 11 46 10 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/1ee5cecf-43d8-4d4d-abce-7491539d4546">


### Testing with Postman


Add a Product to Cart

<img width="787" alt="Screenshot 2024-06-26 at 11 47 56 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/980d9875-5ad0-4ff2-8625-305ab6f8626e">


Delete All Items From Cart


<img width="803" alt="Screenshot 2024-06-26 at 11 49 02 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/c31b7c07-c5ba-4683-a20a-a66049111c89">



Add Another Product To Cart/Get Cart

<img width="797" alt="Screenshot 2024-06-26 at 11 50 15 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/9236c4ca-a501-477e-a9f5-cffa97769a38">



<img width="821" alt="Screenshot 2024-06-26 at 11 50 58 AM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/19aa3ee1-7825-4a5f-84c8-0d31c2d1d305">


</details> 


<details> 
  
**<summary> Editing a Profile </summary>**

Users can also edit their profiles.

 <img width="1190" alt="Screenshot 2024-06-26 at 1 01 39 PM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/f274f034-29fc-4c3b-b18e-9f27c4bc5262">


Once a profile is edited in the website, it is updated in the database as well. 


<img width="738" alt="Screenshot 2024-06-26 at 1 07 22 PM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/a18f84c7-4671-4f4c-9920-47706eab2887">

</details> 

### Interesting Piece of Code


Updates profiles in the website, as well as updates it in the database. 


<img width="833" alt="Screenshot 2024-06-26 at 2 46 40 PM" src="https://github.com/hibbaafzal/CapstoneThree_ECommerce/assets/166542360/0ea8c1c9-ff0b-43a6-b30a-581c75240a5c">


