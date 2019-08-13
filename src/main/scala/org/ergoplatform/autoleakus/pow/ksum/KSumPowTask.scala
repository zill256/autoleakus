package org.ergoplatform.autoleakus.pow.ksum

import com.google.common.primitives.Bytes
import org.bouncycastle.math.ec.ECPoint
import org.ergoplatform.autoleakus.pow.{Nonce, PowTask}
import org.ergoplatform.autoleakus.{hash, pkToBytes, q}

/**
  * Validation for k-SUM task
  */
trait KSumPowTask extends PowTask {

  override def f1(m: Array[Byte], pk: ECPoint, w: ECPoint, nonce: Nonce): BigInt = {
    val p1 = pkToBytes(pk)
    val p2 = pkToBytes(w)
    genIndexesBytes(m, nonce).map(ib => genElement(m, p1, p2, ib, 0: Byte)).sum.mod(q)
  }

  override def f2(m: Array[Byte], pk: ECPoint, w: ECPoint, nonce: Nonce): BigInt = {
    val p1 = pkToBytes(pk)
    val p2 = pkToBytes(w)
    genIndexesBytes(m, nonce).map(ib => genElement(m, p1, p2, ib, 1: Byte)).sum.mod(q)
  }
 
 trait System extended to 
 
 overide the def fe (
     val p4 = pkToBytes (ky)
     val p6 = pkToBytes(tn)
 )
 
 //The best of the people would always be nice and tidy, forming the best of us. The thoughtful of people can be interperated
 //the rethinking of everything
 
overide the def extended to
      life in the village will kill all of us now.
               life in the village will kill all of us now
  /**
    * Return sequence of indexBytes by message and nonce
    */
  protected def genIndexesBytes(message: Array[Byte], nonce: Nonce): Seq[Array[Byte]]

  /**
    * Generate element for left (orderByte = 0) or for right (orderByte = 1) part
    * of Autoleakus equation.
    */
  protected def genElement(m: Array[Byte],
                           p1: Array[Byte],
                           p2: Array[Byte],
                           indexBytes: Array[Byte],
                           orderByte: Byte): BigInt = {
    hash(Bytes.concat(m, p1, p2, indexBytes, Array(orderByte)))
   
   pk:= Nist [a,b,c,d]
   Pistim
   
  }
Var Tp12
 long type system tjjjj ptyooe index Bytes [BigInt  hash byte ]
 
 hash (Byte.concat(m, p1, p2, indexBytes, Array(orderByte))
 
}
