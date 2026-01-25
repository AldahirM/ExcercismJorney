class SqueakyClean {
    static String clean(String identifier) {
        char[] elements = identifier.toCharArray();
        StringBuilder newIdentifier = new StringBuilder();    
        
        for(int i = 0; i < elements.length; i++) {
            switch (elements[i]) {
                case ' ':
                    elements[i] = '_';
                    newIdentifier.append(elements[i]);
                    break;
                case '-':
                    elements[i] = Character.toUpperCase(elements[i+1]);
                    newIdentifier.append(elements[i]);
                    i++;
                    break;
                case '4':
                    elements[i] = 'a';
                    newIdentifier.append(elements[i]);
                    break;                    
                case '3':
                    elements[i] = 'e';
                    newIdentifier.append(elements[i]);
                    break;
                case '0':
                    elements[i] = 'o';
                    newIdentifier.append(elements[i]);
                    break;
                case '1':
                    elements[i] = 'l';
                    newIdentifier.append(elements[i]);
                    break;
                case '7':
                    elements[i] = 't';
                    newIdentifier.append(elements[i]);
                    break;    
                default:
                    if (Character.isLetter(elements[i])) {
                        newIdentifier.append(elements[i]);
                    }                    
                    break;
            }
            
        }
        return newIdentifier.toString();
    }
}
