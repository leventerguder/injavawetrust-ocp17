package chapter07.sealing_classes.zoo;

// public sealed class Penguin permits Emperor {} // DOES NOT COMPILE

import chapter07.sealing_classes.animal.LittlePenguin;

// public sealed class Penguin permits LittlePenguin {}
//Class is not allowed to extend sealed class from another package