package chapter07.sealingclasses;

public sealed interface Swims permits Duck, Fish, Floats, Swan {
}