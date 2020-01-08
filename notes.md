first class is author and author has a first name and last name and he
also has a set of books. So let's take a quick look at book, so a book has a title
and Isbn and a publisher, I'm not sure what isbn stands for that's an
industry standard for identifying books and book also has a set of authors
I want to talk about some of the best practices with
Hibernate. Now we did not implement any type of equal hash code function and
that could cause us a problem here in theory, at least. There's a couple of
nuances to this. And right now, we're just using object, in the underlying object
equality and hash code.

we don't have a good key to go off
of title. We could have more than one book with that same title. It's been, in
theory, should be unique in practice than in logistics. It should be unique
but can't always count on that, being unique, so we don't have...

and I'm also going to implement the two string method so we
have some pretty outputs in here. So the biggest thing here is to remembers that
we are working with sets here, so Java 101 stuff, what set is going to be using
these methods to determine if that object is duplicated inside that set. So
now, before we were using the default object, so with that object ID, now we
actually have an implementation of that so and we are looking at just the ID
value in here. So when we have two objects with the same ID, they will be considered
equal. Now if they have different IDs so that would be considered different and
that's kind of the behavior that we want to see going forward in the course in
this particular use case.


CrudRepository
    save, saveAll, findById, existsById, findAll,
     findAllById, count, deleteById, delete, deleteAll

We'll run run some code to populate our database so we have a 
known set of data that we can work with going forward in this course.
I'm going to show you exactly how to do that I'm going to jump over
an Intellij well write a little bootstrap class to populate data into
our author and books table.
