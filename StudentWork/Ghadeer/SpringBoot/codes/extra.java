 //runnable code goes here
            System.out.println("Animal DAO output:");
            //Animal DAO goes here
            Animal animal = controller.findById(1);
            System.out.println("Animal founded:");

            if (animal != null) {
                animal.eat();
            } else {
                System.out.println("animal has not founded");
            }

            List<Animal> animals = controller.findAll();

            out.println("Number of animals: "+animals.size());

            controller.add(new Animal("Bob"));

            List<Animal> animals2 = controller.findAll();

            out.println("Number of animals: "+animals2.size());

