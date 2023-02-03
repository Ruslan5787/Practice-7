fun main() {
    println("Введите числа a, b, c, u, v.");

    val a: Double = readLine()!!.toDouble();
    val b: Double = readLine()!!.toDouble();
    val c: Double = readLine()!!.toDouble();
    val u: Double = readLine()!!.toDouble();
    val v: Double = readLine()!!.toDouble();

    val x = u;
    val mx = a * Math.pow(x, 2.0) + b *x + c;

}

/*
uses crt;
var a,b,c,u,v,h,x,y,mx,mn:real;
begin
writeln('Введите коэффициенты a,b,c');
read(a,b,c);
repeat
writeln('Введите диапазон [u;v]');
read(u,v);
until u<v;
repeat
write('Введите шаг поиска h<',v-u:0:1,' h=');
read(h);
until h<v-u;
x:=u;
mx:=a*x*x+b*x+c;
mn:=mx;
while x<=v+h/2 do
 begin
  y:=a*x*x+b*x+c;
  writeln('x=',x:4:1,' y=',y:7:2);
  if y>mx then mx:=y
  else if y<mn then mn:=y;
  x:=x+h;
 end;
writeln('Максимум=',mx:0:2);
write('Минимум=',mn:0:2);
end.
*/