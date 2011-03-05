package frege.rt;
// $Author$
// $Date$
// $Rev$
// $Id$
/**
 * <p> Frege functions with arity 7. </p>
 *
 * <p> See {@link Fun1} for a general discussion of function values. </p>
 *
 */
public abstract class Fun7<T1,T2,T3,T4,T5,T6,T7,T8> implements Value, Lazy<Fun7<T1,T2,T3,T4,T5,T6,T7,T8>> {
   /**
     * <p>Apply this function to an argument.</p>
     *
     * <p> This method creates an instance of {@link Fun6} that collects the
     * remaining arguments and, when evaluated, invokes the {@link Fun7#r} method of this
     * function.</p>
     *
     * @return an instance of type <tt>Fun6&lt;T2,T3,T4,T5,T6,T7,T8&gt;</tt> that waits for the
     * remaining arguments to be supplied and calls back with all arguments.
     */
    final public Fun6<T2,T3,T4,T5,T6,T7,T8> a(final Lazy<T1> arg1) {
        return new Fun6<T2,T3,T4,T5,T6,T7,T8> () {
            final public Lazy<T8> r(final Lazy<T7> arg7,final Lazy<T6> arg6,final Lazy<T5> arg5,final Lazy<T4> arg4,final Lazy<T3> arg3,final Lazy<T2> arg2) {
                return Fun7.this.r(arg7,arg6,arg5,arg4,arg3,arg2,arg1);
            }
        };
    }
    /**
     * <p>Apply this function to all its arguments at once.</p>
     *
     * <p> This method creates an instance of {@link Unknown} that,
     * when evaluated, invokes the {@link Fun7#r} method of this
     * function.</p>
     *
     * Use of this method is preferrable if all arguments are known compared
     * to repeated invokation of the single argument form since intermediate
     * closure creation is saved.
     *
     * @return an instance of type <tt>Unknown&lt;T8&gt;</tt>
     */
    final public Unknown<T8> a(final Lazy<T1> arg1,final Lazy<T2> arg2,final Lazy<T3> arg3,final Lazy<T4> arg4,final Lazy<T5> arg5,final Lazy<T6> arg6,final Lazy<T7> arg7) {
        return new Unknown<T8> () {
            final public Lazy<T8> _v() { return Fun7.this.r(arg7,arg6,arg5,arg4,arg3,arg2,arg1); }
        };
    }
    /**
     * <p> Always <tt>0</tt> for function values. </p>
     * @return 0
     */
    final public int     _c() { return 0; }          // interface Value
    /**
     * <p> Return this function object. </p>
     * @return <tt>this</tt>
     */
    final public Fun7<T1,T2,T3,T4,T5,T6,T7,T8> _e() { return this; }       // interface Lazy
    /**
     * <p> Return this function object. </p>
     * @return <tt>this</tt>
     */
    final public Fun7<T1,T2,T3,T4,T5,T6,T7,T8> _v() { return this; }       // interface Lazy
    /**
     * <p> Always <tt>false</tt> for function values. </p>
     * @return <tt>false</tt>
     */
    final public boolean _u() { return false; }      // interface Lazy
    /**
     * <p> Run the function. </p>
     *
     * <p> The run method will be called by the {@link Fun6#r} method
     * of the function value resulting from <tt>this.a(...)</tt>.
     * It actually performs computation and
     * returns a result or another lazy value that will evaluate to the result.<br>
     * This method must be implemented by all subclasses.</p>
     *
     * <p>
     * Note that the arguments must be passed in reverse order. The reason is that
     * in this way the byte code for any intermediate closure will only have to
     * push its argument and invoke the next higher closure's <tt>r</tt> method.
     * A reordering of the arguments on the stack will not be needed. This could save
     * a substantial amounts of memory writes (I hope).
     * </p>
     *
     *
     * @return boxed and possibly lazy result
     */
    abstract public Lazy<T8> r(final Lazy<T7> arg7,final Lazy<T6> arg6,final Lazy<T5> arg5,final Lazy<T4> arg4,final Lazy<T3> arg3,final Lazy<T2> arg2, Lazy<T1> arg1);
    /**
     * <p> Coerce the function to another type. </p>
     * <p> I see no other way to get around the limitations of the java type system, sorry.</p>
     * <p> This will be used in the case of constructor classes.</p>
     */
    @SuppressWarnings("unchecked") 
    public final <X1,X2,X3,X4,X5,X6,X7,X8> Fun7<X1,X2,X3,X4,X5,X6,X7,X8> coerce() { return (Fun7<X1,X2,X3,X4,X5,X6,X7,X8>) this; }
     
}
