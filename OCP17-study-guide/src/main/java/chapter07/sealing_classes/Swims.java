package chapter07.sealing_classes;

public sealed interface Swims permits Duck, Floats, Swan {
}