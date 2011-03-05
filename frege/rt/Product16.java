package frege.rt;
// $Author$
// $Date$
// $Rev$
// $Id$
/**
 * <p> Base class for values constructed with 16-ary constructors. </p>
 *
 * <p> This will be extended by constructors of sum types and by product types.
 *  Subclasses must implement the {@link Value#_c} method and the
 * {@link Lazy} interface.
 * </p>
 *
 * <p> Note that Product<sub><em>16</em></sub> is not a subclass of Product<sub><em>15</em></sub>! </p>
 */
public abstract class Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16> implements Value {
    /** <p> Must be implemented by subclasses to return their constructor number. </p> */
    public abstract int _c();
    /** <p> Default implementation of the {@link Lazy#_u} method. </p>
     *  @return false
     */
    final public boolean _u() { return false; }
    /** <p>Field 1 </p> */
    public final Lazy<T1> m1;
    /** <p> Frege function to get field 1 lazily. </p> */
    public final static class Get1<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T1> {
        public final Lazy<T1> r(final Lazy<T> arg1) {
            return arg1._e().m1;
        }
        private final static Get1 single = new Get1();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get1<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get1<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 2 </p> */
    public final Lazy<T2> m2;
    /** <p> Frege function to get field 2 lazily. </p> */
    public final static class Get2<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T2> {
        public final Lazy<T2> r(final Lazy<T> arg1) {
            return arg1._e().m2;
        }
        private final static Get2 single = new Get2();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get2<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get2<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 3 </p> */
    public final Lazy<T3> m3;
    /** <p> Frege function to get field 3 lazily. </p> */
    public final static class Get3<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T3> {
        public final Lazy<T3> r(final Lazy<T> arg1) {
            return arg1._e().m3;
        }
        private final static Get3 single = new Get3();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get3<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get3<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 4 </p> */
    public final Lazy<T4> m4;
    /** <p> Frege function to get field 4 lazily. </p> */
    public final static class Get4<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T4> {
        public final Lazy<T4> r(final Lazy<T> arg1) {
            return arg1._e().m4;
        }
        private final static Get4 single = new Get4();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get4<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get4<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 5 </p> */
    public final Lazy<T5> m5;
    /** <p> Frege function to get field 5 lazily. </p> */
    public final static class Get5<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T5> {
        public final Lazy<T5> r(final Lazy<T> arg1) {
            return arg1._e().m5;
        }
        private final static Get5 single = new Get5();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get5<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get5<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 6 </p> */
    public final Lazy<T6> m6;
    /** <p> Frege function to get field 6 lazily. </p> */
    public final static class Get6<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T6> {
        public final Lazy<T6> r(final Lazy<T> arg1) {
            return arg1._e().m6;
        }
        private final static Get6 single = new Get6();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get6<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get6<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 7 </p> */
    public final Lazy<T7> m7;
    /** <p> Frege function to get field 7 lazily. </p> */
    public final static class Get7<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T7> {
        public final Lazy<T7> r(final Lazy<T> arg1) {
            return arg1._e().m7;
        }
        private final static Get7 single = new Get7();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get7<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get7<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 8 </p> */
    public final Lazy<T8> m8;
    /** <p> Frege function to get field 8 lazily. </p> */
    public final static class Get8<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T8> {
        public final Lazy<T8> r(final Lazy<T> arg1) {
            return arg1._e().m8;
        }
        private final static Get8 single = new Get8();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get8<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get8<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 9 </p> */
    public final Lazy<T9> m9;
    /** <p> Frege function to get field 9 lazily. </p> */
    public final static class Get9<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T9> {
        public final Lazy<T9> r(final Lazy<T> arg1) {
            return arg1._e().m9;
        }
        private final static Get9 single = new Get9();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get9<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get9<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 10 </p> */
    public final Lazy<T10> m10;
    /** <p> Frege function to get field 10 lazily. </p> */
    public final static class Get10<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T10> {
        public final Lazy<T10> r(final Lazy<T> arg1) {
            return arg1._e().m10;
        }
        private final static Get10 single = new Get10();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get10<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get10<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 11 </p> */
    public final Lazy<T11> m11;
    /** <p> Frege function to get field 11 lazily. </p> */
    public final static class Get11<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T11> {
        public final Lazy<T11> r(final Lazy<T> arg1) {
            return arg1._e().m11;
        }
        private final static Get11 single = new Get11();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get11<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get11<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 12 </p> */
    public final Lazy<T12> m12;
    /** <p> Frege function to get field 12 lazily. </p> */
    public final static class Get12<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T12> {
        public final Lazy<T12> r(final Lazy<T> arg1) {
            return arg1._e().m12;
        }
        private final static Get12 single = new Get12();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get12<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get12<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 13 </p> */
    public final Lazy<T13> m13;
    /** <p> Frege function to get field 13 lazily. </p> */
    public final static class Get13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T13> {
        public final Lazy<T13> r(final Lazy<T> arg1) {
            return arg1._e().m13;
        }
        private final static Get13 single = new Get13();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 14 </p> */
    public final Lazy<T14> m14;
    /** <p> Frege function to get field 14 lazily. </p> */
    public final static class Get14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T14> {
        public final Lazy<T14> r(final Lazy<T> arg1) {
            return arg1._e().m14;
        }
        private final static Get14 single = new Get14();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 15 </p> */
    public final Lazy<T15> m15;
    /** <p> Frege function to get field 15 lazily. </p> */
    public final static class Get15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T15> {
        public final Lazy<T15> r(final Lazy<T> arg1) {
            return arg1._e().m15;
        }
        private final static Get15 single = new Get15();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p>Field 16 </p> */
    public final Lazy<T16> m16;
    /** <p> Frege function to get field 16 lazily. </p> */
    public final static class Get16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            extends Fun1<T, T16> {
        public final Lazy<T16> r(final Lazy<T> arg1) {
            return arg1._e().m16;
        }
        private final static Get16 single = new Get16();
        @SuppressWarnings("unchecked")
        public final static <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, T extends Product16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16>>
            Get16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T> n() {
                return (Get16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T>) single;
        }
    }
    /** <p> Constructor. </p> */
    protected Product16(final Lazy<T1> arg1,final Lazy<T2> arg2,final Lazy<T3> arg3,final Lazy<T4> arg4,final Lazy<T5> arg5,final Lazy<T6> arg6,final Lazy<T7> arg7,final Lazy<T8> arg8,final Lazy<T9> arg9,final Lazy<T10> arg10,final Lazy<T11> arg11,final Lazy<T12> arg12,final Lazy<T13> arg13,final Lazy<T14> arg14,final Lazy<T15> arg15,final Lazy<T16> arg16) {
        m1 = arg1;
        m2 = arg2;
        m3 = arg3;
        m4 = arg4;
        m5 = arg5;
        m6 = arg6;
        m7 = arg7;
        m8 = arg8;
        m9 = arg9;
        m10 = arg10;
        m11 = arg11;
        m12 = arg12;
        m13 = arg13;
        m14 = arg14;
        m15 = arg15;
        m16 = arg16;
    }
}
