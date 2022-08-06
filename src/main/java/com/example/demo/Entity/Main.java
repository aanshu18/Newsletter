package com.example.demo.Entity;

public class Main {

    /*
Build a newsletter subscriptions platform (Language Agnostic)
Problem statement:
You have come up with an idea to build a newsletter subscription platform. Users can subscribe to monthly newsletters on your platform. (Rest API)

We have 3 entities:

1. User: id, name,
2. Newsletter: id, category_id, title, user_id, price
3. Category: id, name
(type of newsletter)
- Get newsletters API:

Any user should be able to query the newsletters on this platform using categories.

Sample request: { "categories" : [ "science", "technology"] }

Sample response:
{"newsletters":[{"science":[{"newsletter_id":1,"title":"Latest in tech by John Doe"},{"newsletter_id":2,"title":"Old in science by John Doe"}]},{"technology":[{"newsletter_id":1,"title":"Latest in tech by John Doe"}]}]}
*/


    public static void main(String[] args) {

    }
}
