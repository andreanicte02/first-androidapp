android

concepto: 
1 actividad -> 1 pantalla

es valido muchas veces

google AdMod es la publicidad de google hahaha

Activity  -> class java
Layout    -> el xml

Estructura de un proyecto simple

app 
    -manifest 
        (sobre todo los permisos de usuario van aca)

    -java
    -res

el contenido de una app, nunca va en la app, va en un fichero aparte (osea asi lo define androdi), esta referenciado en otros archivos .xml

tip: optmiza recursos como imagnes

xxxhdpi-> images para dispo de gran resolucion
mdpi-> imagenes para dispositvos de gama media



```
        Aca se puede cambiar la pantalla inicial 
        #.MainActivity hace referencia a la clase .java
        
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category 
                android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
```

layout es la distribucion de los elementos en pantalla



Tipos de resoluciones de imagenes (de menor gama a mayor gama)

- hdpi 75%

- mdpi 100%

- hdpi 150% 

- xhdpi 200%

- xxhdpi 300%

- xxxhdpi 

  (en linux isntalar gimp)