
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBirthYear_QNAME = new QName("http://ws/", "getBirthYear");
    private final static QName _GetUserResponse_QNAME = new QName("http://ws/", "getUserResponse");
    private final static QName _GetUser_QNAME = new QName("http://ws/", "getUser");
    private final static QName _GetUserListResponse_QNAME = new QName("http://ws/", "getUserListResponse");
    private final static QName _GetUserList_QNAME = new QName("http://ws/", "getUserList");
    private final static QName _GetBirthYearResponse_QNAME = new QName("http://ws/", "getBirthYearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBirthYear }
     * 
     */
    public GetBirthYear createGetBirthYear() {
        return new GetBirthYear();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetUserListResponse }
     * 
     */
    public GetUserListResponse createGetUserListResponse() {
        return new GetUserListResponse();
    }

    /**
     * Create an instance of {@link GetUserList }
     * 
     */
    public GetUserList createGetUserList() {
        return new GetUserList();
    }

    /**
     * Create an instance of {@link GetBirthYearResponse }
     * 
     */
    public GetBirthYearResponse createGetBirthYearResponse() {
        return new GetBirthYearResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBirthYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBirthYear")
    public JAXBElement<GetBirthYear> createGetBirthYear(GetBirthYear value) {
        return new JAXBElement<GetBirthYear>(_GetBirthYear_QNAME, GetBirthYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getUserListResponse")
    public JAXBElement<GetUserListResponse> createGetUserListResponse(GetUserListResponse value) {
        return new JAXBElement<GetUserListResponse>(_GetUserListResponse_QNAME, GetUserListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getUserList")
    public JAXBElement<GetUserList> createGetUserList(GetUserList value) {
        return new JAXBElement<GetUserList>(_GetUserList_QNAME, GetUserList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBirthYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBirthYearResponse")
    public JAXBElement<GetBirthYearResponse> createGetBirthYearResponse(GetBirthYearResponse value) {
        return new JAXBElement<GetBirthYearResponse>(_GetBirthYearResponse_QNAME, GetBirthYearResponse.class, null, value);
    }

}
