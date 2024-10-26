package Policy;

import Committee.Person;

public class Policy {
    void committeeFormingPolicy() {
        //
    }

    boolean memberRecruitingPolicy(Person p) {
        /* is eligible to join tbtKU */
        boolean decision = false;
            if (p.interests.contains("represent KU") &&
                    p.interests.contains("creative") &&
                    p.interests.contains("productive")) {
                decision = true;
            }
        return decision;
    }
}
