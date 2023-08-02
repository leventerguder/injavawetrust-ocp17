package chapter07.encapsulating_data_with_records;


public final record CraneV3(int numberEggs, String name) {
    // Just as interfaces are implicitly abstract, records are also implicitly final. The final modifier is optional but assumed.
}

