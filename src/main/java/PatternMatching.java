

void main(String[] args) {
    System.out.println(asString(42));
    System.out.println(asString("Hello World"));
    System.out.println(asString(1234567890123L));
    System.out.println(asString(3.14));
}

public String asString(Object any) {



    /*if(any instanceof Integer) {
        return "Integer: " + ((Integer) any);
    } else if(any instanceof String) {
        return "String: " + ((String) any);
    } else if(any instanceof Long) {
        return "Long: " + ((Long) any);
    } else {
        return "Unknown";
    }*/

    return switch(any) {
        case Integer i-> STR."Integer: \{i}";
        case String s-> STR."String: \{s}";
        case Long l -> STR."Long: \{l}";
        default -> "Unknown";
    };

    /*return switch(any) {
        case Integer i-> "Integer: " +i.getClass().getName();    // It will be typecasted too..
        case String s-> "String: " +s.getClass().getName();
        case Long l -> "Long: " +l.getClass().getName();
        default -> "Unknown".getClass().getName();
    };*/
}