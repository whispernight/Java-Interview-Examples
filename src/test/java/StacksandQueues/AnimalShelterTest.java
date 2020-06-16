package StacksandQueues;

import org.junit.Test;

import java.net.DatagramPacket;
import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void enqueueAndDequeueAny() {
        Dog dog = new Dog("Kira");
        AnimalShelter ash = new AnimalShelter();
        ash.enqueue(dog);
        assertEquals(dog.name, ash.dequeueAny().name);
    }

    @Test
    public void dequeueAnyWhenEmpty() {
        AnimalShelter ash = new AnimalShelter();
        assertEquals(null, ash.dequeueAny());
    }

    @Test
    public void dequeueSeveralDogs() {
        Dog dog1 = new Dog("Kira");
        Dog dog2 = new Dog("Dash");
        Dog dog3 = new Dog("Bolt");

        AnimalShelter ash = new AnimalShelter();
        ash.enqueue(dog1);
        ash.enqueue(dog2);
        ash.enqueue(dog3);

        assertEquals(dog1.name, ash.dequeueAny().name);
    }

    @Test
    public void dequeueSeveralDogsAndCats1() {
        Dog dog1 = new Dog("Kira");
        Dog dog2 = new Dog("Dash");
        Dog dog3 = new Dog("Bolt");
        Cat cat1 = new Cat("Missy");

        AnimalShelter ash = new AnimalShelter();
        ash.enqueue(dog1);
        ash.enqueue(dog2);
        ash.enqueue(cat1);
        ash.enqueue(dog3);

        assertEquals(dog1.name, ash.dequeueAny().name);
        assertEquals(dog2.name, ash.dequeueAny().name);
        assertEquals(cat1.name, ash.dequeueAny().name);
        assertEquals(dog3.name, ash.dequeueAny().name);
    }

    @Test
    public void dequeueSeveralDogsAndCats2() {
        Dog dog1 = new Dog("Kira");
        Dog dog2 = new Dog("Dash");
        Dog dog3 = new Dog("Bolt");
        Cat cat1 = new Cat("Missy");

        AnimalShelter ash = new AnimalShelter();
        ash.enqueue(cat1);
        ash.enqueue(dog1);
        ash.enqueue(dog2);
        ash.enqueue(dog3);

        assertEquals(cat1.name, ash.dequeueAny().name);
        assertEquals(dog1.name, ash.dequeueAny().name);
        assertEquals(dog2.name, ash.dequeueAny().name);
        assertEquals(dog3.name, ash.dequeueAny().name);
    }

    @Test
    public void dequeueSeveralDogsAndCats3() {
        Dog dog1 = new Dog("Kira");
        Dog dog2 = new Dog("Dash");
        Dog dog3 = new Dog("Bolt");
        Cat cat1 = new Cat("Missy");

        AnimalShelter ash = new AnimalShelter();
        ash.enqueue(dog1);
        ash.enqueue(dog2);
        ash.enqueue(dog3);
        ash.enqueue(cat1);

        assertEquals(dog1.name, ash.dequeueAny().name);
        assertEquals(dog2.name, ash.dequeueAny().name);
        assertEquals(dog3.name, ash.dequeueAny().name);
        assertEquals(cat1.name, ash.dequeueAny().name);
    }
}