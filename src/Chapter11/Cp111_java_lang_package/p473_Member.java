package Chapter11.Cp111_java_lang_package;

import java.lang.reflect.Member;

public class p473_Member {
    public String id;

    public p473_Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            p473_Member member = (p473_Member) obj;
            if(id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
