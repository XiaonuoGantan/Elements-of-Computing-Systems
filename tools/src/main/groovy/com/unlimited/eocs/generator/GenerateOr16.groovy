def range = 0..15


for (i in range) {

    println """
Not(in=a[${i}],out=nota${i});
Not(in=b[${i}],out=notb${i});
And(a=nota${i}, b=notb${i}, out=o${i});
Not(in=o${i}, out=out[${i}]);
"""

}

/*

This is generated

Not(in=a[0],out=nota0);
Not(in=b[0],out=notb0);
And(a=nota0, b=notb0, out=o0);
Not(in=o0, out=out[0]);


Not(in=a[1],out=nota1);
Not(in=b[1],out=notb1);
And(a=nota1, b=notb1, out=o1);
Not(in=o1, out=out[1]);


Not(in=a[2],out=nota2);
Not(in=b[2],out=notb2);
And(a=nota2, b=notb2, out=o2);
Not(in=o2, out=out[2]);


Not(in=a[3],out=nota3);
Not(in=b[3],out=notb3);
And(a=nota3, b=notb3, out=o3);
Not(in=o3, out=out[3]);


Not(in=a[4],out=nota4);
Not(in=b[4],out=notb4);
And(a=nota4, b=notb4, out=o4);
Not(in=o4, out=out[4]);


Not(in=a[5],out=nota5);
Not(in=b[5],out=notb5);
And(a=nota5, b=notb5, out=o5);
Not(in=o5, out=out[5]);


Not(in=a[6],out=nota6);
Not(in=b[6],out=notb6);
And(a=nota6, b=notb6, out=o6);
Not(in=o6, out=out[6]);


Not(in=a[7],out=nota7);
Not(in=b[7],out=notb7);
And(a=nota7, b=notb7, out=o7);
Not(in=o7, out=out[7]);


Not(in=a[8],out=nota8);
Not(in=b[8],out=notb8);
And(a=nota8, b=notb8, out=o8);
Not(in=o8, out=out[8]);


Not(in=a[9],out=nota9);
Not(in=b[9],out=notb9);
And(a=nota9, b=notb9, out=o9);
Not(in=o9, out=out[9]);


Not(in=a[10],out=nota10);
Not(in=b[10],out=notb10);
And(a=nota10, b=notb10, out=o10);
Not(in=o10, out=out[10]);


Not(in=a[11],out=nota11);
Not(in=b[11],out=notb11);
And(a=nota11, b=notb11, out=o11);
Not(in=o11, out=out[11]);


Not(in=a[12],out=nota12);
Not(in=b[12],out=notb12);
And(a=nota12, b=notb12, out=o12);
Not(in=o12, out=out[12]);


Not(in=a[13],out=nota13);
Not(in=b[13],out=notb13);
And(a=nota13, b=notb13, out=o13);
Not(in=o13, out=out[13]);


Not(in=a[14],out=nota14);
Not(in=b[14],out=notb14);
And(a=nota14, b=notb14, out=o14);
Not(in=o14, out=out[14]);


Not(in=a[15],out=nota15);
Not(in=b[15],out=notb15);
And(a=nota15, b=notb15, out=o15);
Not(in=o15, out=out[15]);



*/