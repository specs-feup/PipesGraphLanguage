//source

/*input*/ Instance.name = Instance.component.out(source.method(method.args))
/*test*/ 

//filter
(Instance.method(Instance.component.in(out.previous.instance)))

/*bubble*/ converter.component.out(bubble.method(converter.component.in(/*input*/)))

/*avg*/ converter.component.out(avg.method(converter.component.in(/*input*/)))


//sink 
Instance.method(Instance.component.in(method.args))
/*cmdLine*/ cmdLine.method(converter.component.in(/*input*/))
