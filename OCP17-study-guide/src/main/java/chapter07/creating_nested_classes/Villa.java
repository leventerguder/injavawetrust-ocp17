package chapter07.creating_nested_classes;

public class Villa {

    private class Room { // Inner class declaration

        private void enter() {
            System.out.println("Room#enter");
        }
    }

    public static void main(String[] args) {

        var villa = new Villa();
        Room room = villa.new Room();
        room.enter();


        new Villa().new Room().enter();

    }
}
