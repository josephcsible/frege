package frege.rt;
// $Author$
// $Date$
// $Rev$
// $Id$
/**
 * <p> Base class for values constructed with 2-ary constructors. </p>
 *
 * <p> This will be extended by constructors of sum types and by product types.
 *  Subclasses must implement the {@link Value#_c} method and the
 * {@link Lazy} interface.
 * </p>
 *
 * <p> Note that Product<sub><em>2</em></sub> is not a subclass of Product<sub><em>1</em></sub>! </p>
 */
public abstract class Product2<T1,T2> implements Value {
    /** <p> Must be implemented by subclasses to return their constructor number. </p> */
    public abstract int _c();
    /** <p> Default implementation of the {@link Lazy#_u} method. </p>
     *  @return false
     */
    final public boolean _u() { return false; }
    /** <p>Field 1 </p> */
    public final Lazy<T1> m1;
    /** <p> Frege function to get field 1 lazily. </p> */
    public final static class Get1<T1,T2, T extends Product2<T1,T2>>
            extends Fun1<T, T1> {
        public final Lazy<T1> r(final Lazy<T> arg1) {
            return arg1._e().m1;
        }
        private final static Get1 single = new Get1();
        @SuppressWarnings("unchecked")
        public final static <T1,T2, T extends Product2<T1,T2>>
            Get1<T1,T2,T> n() {
                return (Get1<T1,T2,T>) single;
        }
    }
    /** <p>Field 2 </p> */
    public final Lazy<T2> m2;
    /** <p> Frege function to get field 2 lazily. </p> */
    public final static class Get2<T1,T2, T extends Product2<T1,T2>>
            extends Fun1<T, T2> {
        public final Lazy<T2> r(final Lazy<T> arg1) {
            return arg1._e().m2;
        }
        private final static Get2 single = new Get2();
        @SuppressWarnings("unchecked")
        public final static <T1,T2, T extends Product2<T1,T2>>
            Get2<T1,T2,T> n() {
                return (Get2<T1,T2,T>) single;
        }
    }
    /** <p> Constructor. </p> */
    protected Product2(final Lazy<T1> arg1,final Lazy<T2> arg2) {
        m1 = arg1;
        m2 = arg2;
    }
}
