package org.example.Structural.Adapter;

public class definition {
    void definitionAdapterPattern(){
        /*
        *
        *   The Adapter Pattern is a structural design pattern that serves as a bridge between two
            incompatible interfaces, enabling them to work together by providing data in a format the
            client expects.
        *
        *   Real Life Examples:-
        *   1. WeighingScale
        *       Metric Weight System          ->         Weight Adapter        ->          Existing Interface (Adaptee)
        *     Configured to consume data              Converts Imperial Data           Configured to consume data
        *      in Metric System (in Kg)                  to Metric                   in Imperial System (in pounds)
        *
        *
        *   2. Plug, Socket & Power Adapter
        *       2-pin Electrical plug     ->      Universal Multipin Adapter    ->      3 pin socket (Adaptee)
        *
        *
        *   3. XMLJSONParser
        *       Modern UI Client         ->       XML2JSONAdapter        ->      ExistingLegacyInterface (Adaptee)
        *     Configured to consume             Converts XML data to                 Configured to yield data
        *      data in JSON Format                  JSON data                           in XML Data Format
        *
        *
        * */
    }
}
